import { Component, OnInit } from '@angular/core';
import { Regiao } from '../model/regiao';
import { RegiaoService } from '../service/regiao.service';

@Component({
  selector: 'app-incidencias',
  templateUrl: './incidencias.component.html',
  styleUrls: ['./incidencias.component.css']
})
export class IncidenciasComponent implements OnInit {

  regioes: Regiao[] = [];

  constructor(private regiaoService:RegiaoService) { }

  ngOnInit(): void {
    this.regioes = this.regiaoService.listRegioes();
  }

}
