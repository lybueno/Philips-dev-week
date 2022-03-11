import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { IncidenciasRoutingModule } from './incidencias-routing.module';
import { IncidenciasComponent } from './incidencias/incidencias.component';
import {MatSortModule} from '@angular/material/sort';
import {MatCardModule} from '@angular/material/card';


@NgModule({
  declarations: [
    IncidenciasComponent
  ],
  imports: [
    CommonModule,
    IncidenciasRoutingModule,
    MatSortModule,
    MatCardModule
  ]
})
export class IncidenciasModule { }
