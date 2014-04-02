package com.example.DariuszFe.service;

import java.util.ArrayList;
import java.util.List;

import com.example.DariuszFe.domain.rejestracja;

public class Rejestracja {

private List<rejestracja> db = new ArrayList<rejestracja>();

public void add(rejestracja rejestracja){
rejestracja newOsoba = new rejestracja(rejestracja.getLogin(),rejestracja.getPassword(),rejestracja.getEmail());
db.add(newOsoba);
}

public List<rejestracja> getAllrejestracja(){
return db;
}

}