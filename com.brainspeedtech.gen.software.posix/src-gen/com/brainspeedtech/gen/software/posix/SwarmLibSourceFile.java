package com.brainspeedtech.gen.software.posix;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.project.util.*;;

public class SwarmLibSourceFile
{
  protected static String nl;
  public static synchronized SwarmLibSourceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SwarmLibSourceFile result = new SwarmLibSourceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#include <stdlib.h>" + NL + "#include <stdio.h>" + NL + "#include <string.h>" + NL + "#include <errno.h>" + NL + "#include <netdb.h>" + NL + "#include <signal.h>" + NL + "#include <fcntl.h>" + NL + "#include <netinet/ip.h>" + NL + "#include <sys/socket.h>" + NL + "#include <sys/un.h>" + NL + "#include <stddef.h>" + NL + "#include <unistd.h>" + NL + "#include <time.h>" + NL + "#include <sched.h>" + NL + "#include <pthread.h>" + NL + "#include \"gen_";
  protected final String TEXT_4 = "_swarm_lib.h\"" + NL + "#include \"gen_";
  protected final String TEXT_5 = ".h\"" + NL + "#include <stdarg.h>" + NL + "#include <sys/time.h>" + NL + "" + NL + "extern const char* log_file_name __attribute__((weak));" + NL + "extern const char* log_file_name_second __attribute__((weak));" + NL + "" + NL + "extern int work_dir_fd;" + NL + "int log_file_offset = 0;" + NL + "int log_file = -1;" + NL + "FILE* fd_log_file;" + NL + "int log_file_size = 32*1024;" + NL + "" + NL + "void swarm_print(int level, const char* format, ...)" + NL + "{" + NL + "\tif(log_file_size == 0) return;" + NL + "\t" + NL + "\tva_list list;" + NL + "\tva_start(list, format);" + NL + "\t" + NL + "\tstruct timeval tv;" + NL + "\tstruct timezone tz;" + NL + "\tstruct tm *tm;" + NL + "\tgettimeofday(&tv, &tz);" + NL + "\ttm=localtime(&tv.tv_sec);" + NL + "\t" + NL + "\tif(&log_file_name == NULL) {" + NL + "\t\tvfprintf(stderr, format, list);" + NL + "\t\treturn;" + NL + "\t}" + NL + "\t" + NL + "\tif(log_file == -1) {" + NL + "\t\tlog_file = openat(work_dir_fd, log_file_name, O_RDWR | O_CREAT, 0666);" + NL + "\t\tif(log_file < 0) {" + NL + "\t\t\tperror(\"Opening log file\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tfd_log_file = fdopen(log_file, \"w\");" + NL + "\t\tif(fd_log_file == NULL) {" + NL + "\t\t\tperror(\"Opening log file stream\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t}" + NL + "\tif(level >= 0) {" + NL + "\t\tlog_file_offset += fprintf(fd_log_file," + NL + "\t\t\t\"nl_%d %d:%02d:%02d %ld:\", level, tm->tm_hour, tm->tm_min, tm->tm_sec, tv.tv_usec);" + NL + "\t}" + NL + "\tlog_file_offset += vfprintf(fd_log_file, format, list);" + NL + "\tfflush(fd_log_file);" + NL + "\t\t\t" + NL + "\tif(log_file_size > 0 && log_file_offset >= log_file_size) {" + NL + "\t\tfclose(fd_log_file);" + NL + "\t\tclose(log_file);" + NL + "\t\t" + NL + "\t\tif(renameat(work_dir_fd, log_file_name, work_dir_fd, log_file_name_second) < 0) {" + NL + "\t\t\tperror(\"Renaming file\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tlog_file = -1;" + NL + "\t\tlog_file_offset = 0;\t\t" + NL + "\t}" + NL + "}" + NL + "" + NL + "// There is a tiniest bit of race here sometimes" + NL + "int read_blocking(const char* name, int fd, char* buffer, size_t buffer_size, int nonblocking)" + NL + "{" + NL + "\tint return_value;" + NL + "\tsize_t requested_size = buffer_size;\t" + NL + "\twhile(buffer_size != 0) {" + NL + "\t\treturn_value = read(fd, buffer, buffer_size);" + NL + "\t\tif (return_value < 0) {" + NL + "\t\t\tif(errno == EAGAIN && errno == EWOULDBLOCK) {" + NL + "\t\t\t\tif(nonblocking) return requested_size - buffer_size;" + NL + "\t\t\t\tsched_yield();" + NL + "\t\t\t\tcontinue;" + NL + "\t\t\t}" + NL + "\t\t\tSWARM_PRINT(\"%s(%d): Credit read Error %s(%d)\", name, fd," + NL + "\t\t\t\tstrerror(errno), errno);" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\tbuffer_size -= return_value;" + NL + "\t\tbuffer += return_value;" + NL + "\t}" + NL + "\treturn requested_size;" + NL + "}" + NL + "" + NL + "void write_blocking(const char* name, int fd, char* buffer, size_t buffer_size)" + NL + "{" + NL + "\tint return_value;" + NL + "\t\t" + NL + "\twhile(buffer_size != 0) {" + NL + "\t\treturn_value = write(fd, buffer, buffer_size);" + NL + "\t\tif (return_value < 0) {" + NL + "\t\t\tif(errno == EAGAIN && errno == EWOULDBLOCK) {" + NL + "\t\t\t\tsched_yield();" + NL + "\t\t\t\tcontinue;" + NL + "\t\t\t}" + NL + "\t\t\tSWARM_PRINT(\"%s(%d): Credit read Error %s(%d)\", name, fd," + NL + "\t\t\t\tstrerror(errno), errno);" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\tbuffer_size -= return_value;" + NL + "\t\tbuffer += return_value;" + NL + "\t}" + NL + "}" + NL + "" + NL + "void swarm_dump_data_nl(int level, unsigned int addr, char* data, size_t length)" + NL + "{" + NL + "    int leading_offset;" + NL + "    int trailing_offset;" + NL + "    int run_length;" + NL + "   " + NL + "    while (length) {" + NL + "" + NL + "       leading_offset = addr & 0xF;" + NL + "       run_length = (length + leading_offset > 16) ? 16 - leading_offset : length;" + NL + "       trailing_offset = 16 - ((addr + run_length) & 0xF);" + NL + "       if(trailing_offset == 16) trailing_offset = 0;" + NL + "       SWARM_PRINT_NL(level, \"0x%08x\", (addr - leading_offset));" + NL + "" + NL + "       while(leading_offset--) {" + NL + "           swarm_print(-1, \" . \");" + NL + "       }" + NL + "" + NL + "       while(run_length--) {" + NL + "           swarm_print(-1, \" %02x\", (0xff)&(*data));" + NL + "           length --;" + NL + "           data ++;" + NL + "           addr ++;" + NL + "       }" + NL + "" + NL + "       while (trailing_offset--) {" + NL + "           swarm_print(-1, \" . \");" + NL + "       }" + NL + "" + NL + "       swarm_print(-1, \"\\n\");" + NL + "    }" + NL + "" + NL + "}" + NL + "" + NL + "void swarm_read_fd(const char* name, fd_pair_t* fd, int printlog, int nonblocking)" + NL + "{" + NL + "\tint32_t read_size;" + NL + "\tchar* ptr = fd->pending_ptr;" + NL + "\tsize_t size = fd->pending_size;" + NL + "" + NL + "\twhile(fd->pending_size) {" + NL + "\t \tread_size = read(fd->fd, fd->pending_ptr, fd->pending_size); " + NL + "\t" + NL + "\t\tif (read_size < 0) {" + NL + "\t\t\tif(errno != EAGAIN && errno != EWOULDBLOCK) {" + NL + "\t\t\t\tSWARM_PRINT(\"%s(%d): Read Error %s(%d)\", name, fd->fd," + NL + "\t\t\t\t\tstrerror(errno), errno);" + NL + "\t\t\t\texit(-1);" + NL + "\t\t\t}" + NL + "\t\t\tread_size = 0;" + NL + "\t\t}" + NL + "\t\tfd->pending_size -= read_size;" + NL + "\t\tfd->pending_ptr += read_size;" + NL + "\t\t" + NL + "\t\tif (fd->credit_fd >= 0 && read_size != 0) {" + NL + "\t\t\twrite_blocking(name, fd->credit_fd, (char*)&read_size, sizeof(read_size));" + NL + "\t\t\t//printf(\"Sent %d credits\\n\", read_size);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tsched_yield();" + NL + "\t\t" + NL + "\t\tif (nonblocking) return;" + NL + "\t}" + NL + "\tif (printlog) {" + NL + " \t\tSWARM_PRINT_NL(1, \"%s(%d): Received %p(%d)\\n\", name, fd->fd, ptr, (int)size);" + NL + "\t\tswarm_dump_data_nl(1, 0, ptr, size);" + NL + "\t}" + NL + "}" + NL + "" + NL + "void swarm_write_fd(const char* name, fd_pair_t *fd, int printlog, int nonblocking)" + NL + "{" + NL + "\tint write_size;" + NL + "\tint trimmed_size;" + NL + "" + NL + "\tif (printlog) {" + NL + "\t\tSWARM_PRINT_NL(1, \"%s(%d): Posting send %p(%d)\\n\", name, fd->fd, fd->pending_ptr," + NL + "\t\t(int)fd->pending_size);" + NL + "\t\tswarm_dump_data_nl(1, 0, fd->pending_ptr, fd->pending_size);" + NL + "\t}" + NL + "\t" + NL + "\tif (fd->credit_fd >= 0 && fd->init_credits == 0) {" + NL + "\t\tint32_t read_size = 0;" + NL + "\t\tread_blocking(name, fd->credit_fd, (char*)&read_size, sizeof(read_size), nonblocking);" + NL + "\t\tfd->init_credits = read_size;\t" + NL + "\t}" + NL + "\t\t" + NL + "\twhile(fd->pending_size) {" + NL + "\t" + NL + "\t\ttrimmed_size = fd->pending_size;" + NL + "\t\tif (fd->credit_fd >= 0) {" + NL + "\t\t\tif (fd->init_credits < trimmed_size) trimmed_size = fd->init_credits;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tif (trimmed_size > 0) {" + NL + "\t\t \twrite_size = write(fd->fd, fd->pending_ptr, trimmed_size); " + NL + "\t\t" + NL + "\t\t\tif (write_size < 0) {" + NL + "\t\t\t\tif(errno != EAGAIN && errno != EWOULDBLOCK) {" + NL + "\t\t\t\t\tSWARM_PRINT(\"%s(%d): Write Error %s(%d)\", name, fd->fd," + NL + "\t\t\t\t\t\tstrerror(errno), errno);" + NL + "\t\t\t\t\texit(-1);" + NL + "\t\t\t\t}" + NL + "\t\t\t\twrite_size = 0;" + NL + "\t\t\t}" + NL + "\t\t\tfd->pending_size -= write_size;" + NL + "\t\t\tfd->pending_ptr += write_size;" + NL + "\t\t\ttrimmed_size -= write_size;" + NL + "\t\t\tfd->init_credits -= write_size;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tif (fd->credit_fd >= 0 && fd->init_credits == 0) {" + NL + "\t\t\tint32_t read_size = 0;" + NL + "\t\t\tread_blocking(name, fd->credit_fd, (char*)&read_size, sizeof(read_size), nonblocking);" + NL + "\t\t\tfd->init_credits = read_size;\t" + NL + "\t\t\t//printf(\"Received %d credits\\n\", read_size);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tsched_yield();" + NL + "\t\t" + NL + "\t\tif(nonblocking) return;" + NL + "\t}" + NL + "}" + NL + "" + NL + "struct sockaddr_in getipa(const char* hostname, int port){" + NL + "\tstruct sockaddr_in ipa;" + NL + "\tipa.sin_family = AF_INET;" + NL + "\tipa.sin_port = htons(port);" + NL + "\t" + NL + "\tstruct hostent* localhost = gethostbyname(hostname);" + NL + "\tif(!localhost){" + NL + "\t\tperror(\"resolving localhost\");\t" + NL + "\t\treturn ipa;" + NL + "\t}" + NL + "\t" + NL + "\tchar* addr = localhost->h_addr_list[0];" + NL + "\tmemcpy(&ipa.sin_addr.s_addr, addr, sizeof addr);" + NL + "\t" + NL + "\treturn ipa;" + NL + "}" + NL + "" + NL + "int swarm_tcp_server_socket(const char* name, const char* host, int port)" + NL + "{" + NL + "\tstruct protoent* tcp;" + NL + "\tint one = 1;" + NL + "\t" + NL + "\ttcp = getprotobyname(\"tcp\");" + NL + "\t" + NL + "\tint sfd = socket(PF_INET, SOCK_STREAM, tcp->p_proto);" + NL + "\tif(sfd < 0){" + NL + "\t\tperror(\"creating a tcp socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tstruct sockaddr_in isa = getipa(host, port);" + NL + "\t" + NL + "\tif(bind(sfd, (struct sockaddr*)&isa, sizeof isa) < 0){" + NL + "\t\tperror(\"binding socket to IP address\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tif(setsockopt(sfd, SOL_SOCKET, SO_REUSEADDR, &one, sizeof(one)) < 0) {" + NL + "\t\tperror(\"Setting SO_REUSEADDR failed:\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tSWARM_PRINT_NL(0, \"%s: listening on %s:%d\\n\", name, host, port);" + NL + "\tif(listen(sfd, 1) < 0){" + NL + "\t\tperror(\"setting socket to listen\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "" + NL + "\treturn sfd;" + NL + "}" + NL + "" + NL + "" + NL + "" + NL + "int swarm_tcp_client_socket(const char* name, const char* host, int port)" + NL + "{" + NL + "\tstruct protoent* tcp;" + NL + "\ttcp = getprotobyname(\"tcp\");" + NL + "\t" + NL + "\tint sfd = socket(PF_INET, SOCK_STREAM, tcp->p_proto);" + NL + "\tif(sfd == -1){" + NL + "\t\tperror(\"creating a tcp socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tstruct sockaddr_in isa = getipa(host, port);" + NL + "\t" + NL + "\tif(fcntl(sfd, F_SETFL, fcntl(sfd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for client socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tSWARM_PRINT_NL(0, \"%s: Connecting to %s:%d\\n\", name, host, port);" + NL + "\tif(connect(sfd, (struct sockaddr*)&isa, sizeof isa) < 0){" + NL + "\t\tif (errno != EINPROGRESS) {" + NL + "\t\t\tperror(\"connecting to server\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t}" + NL + "\treturn sfd;" + NL + "}" + NL + "" + NL + "int swarm_unix_server_socket(const char* name, const char* work_dir)" + NL + "{" + NL + "\tchar* prevdir = getcwd(NULL, 0);" + NL + "\t" + NL + "\tif (chdir(work_dir) < 0) {" + NL + "\t\tperror (\"Error entering work directory:\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tint sfd = socket(AF_UNIX, SOCK_STREAM, 0);" + NL + "\tif(sfd < 0){" + NL + "\t\tperror(\"creating a unix socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tstruct sockaddr_un isa;" + NL + "\tisa.sun_family = AF_UNIX;" + NL + "\tsprintf(isa.sun_path, \"%s\", name);" + NL + "\t" + NL + "\tif(bind(sfd, (struct sockaddr*)&isa, offsetof(struct sockaddr_un, sun_path) + strlen(name) + 1) < 0){" + NL + "\t\tperror(\"binding unix socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tSWARM_PRINT_NL(0, \"%s: listening on %s\\n\", name, name);" + NL + "\tif(listen(sfd, 1) < 0){" + NL + "\t\tperror(\"setting socket to listen\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "" + NL + "\tif(chdir(prevdir) < 0) {" + NL + "\t\tperror (\"Error returning from work dir:\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tfree(prevdir);" + NL + "\treturn sfd;" + NL + "}" + NL + "" + NL + "" + NL + "" + NL + "int swarm_unix_client_socket(const char* name, const char* work_dir)" + NL + "{" + NL + "\tchar* prevdir = getcwd(NULL, 0);" + NL + "\t" + NL + "\tif (chdir(work_dir) < 0) {" + NL + "\t\tperror (\"Error entering work directory:\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tint sfd = socket(AF_UNIX, SOCK_STREAM, 0);" + NL + "\tif(sfd == -1){" + NL + "\t\tperror(\"creating a unix socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tstruct sockaddr_un isa;" + NL + "\tisa.sun_family = AF_UNIX;" + NL + "\tsprintf(isa.sun_path, \"%s\", name);" + NL + "\t" + NL + "\tif(fcntl(sfd, F_SETFL, fcntl(sfd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for client socket\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tSWARM_PRINT(\"%s: Connecting to %s\\n\", name, name);" + NL + "retry_connect:" + NL + "\tif(connect(sfd, (struct sockaddr*)&isa, offsetof(struct sockaddr_un, sun_path) + strlen(name) + 1) < 0){" + NL + "\t\tswarm_print(-1, \".\");" + NL + "\t\tsched_yield();" + NL + "\t\tgoto retry_connect;" + NL + "\t}" + NL + "\t" + NL + "\tif(chdir(prevdir) < 0) {" + NL + "\t\tperror (\"Error returning from work dir:\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tfree(prevdir);" + NL + "\treturn sfd;" + NL + "\t" + NL + "\treturn sfd;" + NL + "}" + NL + "" + NL + "void swarm_generate_random_data(uint8_t* data, uint32_t length)" + NL + "{" + NL + "\twhile(length) {" + NL + "\t\t*data = (uint8_t)random();" + NL;
  protected final String TEXT_6 = "\t\tdata++;" + NL + "\t\tlength--;" + NL + "\t}" + NL + "}" + NL + "" + NL + "void swarm_generate_sequential_data(uint8_t* data, uint32_t length)" + NL + "{" + NL + "\tuint8_t i = 0;" + NL + "\twhile(length) {" + NL + "\t\t*data = i;" + NL + "\t\ti++;" + NL + "\t\tdata++;" + NL + "\t\tlength--;" + NL + "\t}" + NL + "}" + NL + "" + NL + "" + NL + "typedef struct _fifo_thread_args {" + NL + "    int input_fd;" + NL + "    int output_fd;" + NL + "    pthread_t thread;" + NL + "} fifo_thread_args_t;" + NL + "" + NL + "#define MAX_FIFO_SIZE (4096)" + NL + "" + NL + "static void* fifo_thread(void *arg)" + NL + "{" + NL + "    fifo_thread_args_t *fifo_arg = (fifo_thread_args_t*)arg;" + NL + "    " + NL + "    if(fcntl(fifo_arg->input_fd, F_SETFL, fcntl(fifo_arg->input_fd, F_GETFL) & ~O_NONBLOCK) < 0) {" + NL + "        perror(\"Could not set blocking flag for fifo\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    if(fcntl(fifo_arg->output_fd, F_SETFL, fcntl(fifo_arg->output_fd, F_GETFL) & ~O_NONBLOCK) < 0) {" + NL + "        perror(\"Could not set blocking flag for fifo\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    char fifo_buffer[MAX_FIFO_SIZE];" + NL + "   " + NL + "    while(1) {" + NL + "        int fifo_size = read(fifo_arg->input_fd, fifo_buffer, MAX_FIFO_SIZE);" + NL + "        if (fifo_size < 0) {" + NL + "            perror(\"Read error from fifo\");" + NL + "            exit(-1);" + NL + "        }" + NL + "        " + NL + "        int fifo_ptr = 0;" + NL + "        while(fifo_size != 0) {" + NL + "            int return_value = write(fifo_arg->output_fd, &fifo_buffer[fifo_ptr], fifo_size);" + NL + "            if (return_value < 0) {" + NL + "                perror(\"Write error from fifo\");" + NL + "                exit(-1);" + NL + "            }" + NL + "            " + NL + "            fifo_size -= return_value;" + NL + "            fifo_ptr += return_value;" + NL + "        }     " + NL + "    }" + NL + "    return NULL;" + NL + "}" + NL + "" + NL + "void swarm_fifo_thread(fd_pair_t* input, fd_pair_t* output)" + NL + "{" + NL + "    fifo_thread_args_t *args = malloc(sizeof(fifo_thread_args_t));" + NL + "    if (args == NULL) {" + NL + "        fprintf(stderr, \"Error allocating fifo args\\n\");" + NL + "        exit (-1);" + NL + "    }" + NL + "    " + NL + "    memset(args, 0, sizeof(*args));" + NL + "    " + NL + "    args->input_fd = input->fd;" + NL + "    args->output_fd = output->fd;" + NL + "" + NL + "    if(pthread_create(&args->thread, NULL, fifo_thread, args) < 0) {" + NL + "        perror(\"Could not create fifo thread\\n\");" + NL + "        exit(-1);" + NL + "    }" + NL + "     " + NL + "    if (input->credit_fd >= 0 && output->credit_fd >= 0) {" + NL + "        args = malloc(sizeof(fifo_thread_args_t));" + NL + "        if (args == NULL) {" + NL + "            fprintf(stderr, \"Error allocating fifo args\\n\");" + NL + "            exit (-1);" + NL + "        }" + NL + "        " + NL + "        memset(args, 0, sizeof(*args));" + NL + "        args->output_fd = input->credit_fd;" + NL + "        args->input_fd = output->credit_fd;" + NL + "" + NL + "        " + NL + "        if(pthread_create(&args->thread, NULL, fifo_thread, args) < 0) {" + NL + "            perror(\"Could not create fifo thread\\n\");" + NL + "            exit(-1);" + NL + "        }" + NL + "        " + NL + "    }" + NL + "" + NL + "}";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}