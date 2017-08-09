
String.prototype.toWordCase = function() {
    return this.replace(/_([a-z])/g, function(match, p) {
        return " " + p.toUpperCase();    
    }).replace(/^([a-z])/, function(match, p1) {
        return p1.toUpperCase() + match.substr(1);
    });;
};

String.prototype.toDashCase = function() {
    return this.replace(/_([a-z])/g, function(match, p) {
        return "-" + p.toLowerCase();    
    });
};

var generator_map = {};
var fs = require("fs");
var mkdirp = require("mkdirp");
var path = require("path");

var source = fs.readFileSync('map._', { 'encoding':'utf8'});
var template = _.template(source);
var source = template({swarm_design: swarm_design});
eval(source);

_.each(generator_map, function(value, key) {
	console.log("Generating File " + key + " from " + value.template);
	
	var template = fs.readFileSync(value.template, { 'encoding' : 'utf8' });
	template = _.template(template);
	template = template(value.object);
	template = template.replace(/\n\s*\n/g, '\n');
	
	var dir = path.dirname(key);
	mkdirp.sync(dir);
	fs.writeFileSync(key, template);
});