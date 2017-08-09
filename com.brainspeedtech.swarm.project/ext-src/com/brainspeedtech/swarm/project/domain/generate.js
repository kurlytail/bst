

var template = generator_map[current_file].template;
var file_data = template(generator_map[current_file].object);
file_data = file_data.replace(/[\r\n](\s+[\r\n])+/g,"\n\n");


