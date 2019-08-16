#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

class DiaDeSemana {
  DiaDeSemana(String _name){
    this.Name = _name;
  }
  String Name; 
}
