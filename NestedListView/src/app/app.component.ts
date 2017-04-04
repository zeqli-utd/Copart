import { Component, OnInit } from '@angular/core';
import {ListService} from './list.service';
import {Country, DataModel, State} from './model';
import _ from 'underscore';

@Component({
  selector: 'app-root',
  template: `
    <div>
      <ng-container *ngFor="let country of DataModel">
        <li>{{country.countryName}}</li>
        <ul>
          <ng-container *ngFor="let state of country.states">
            <li>{{state.stateName}}</li>
            <ul>
              <ng-container *ngFor="let city of state">
                <li>{{city.cityName}}</li>
              </ng-container>
            </ul>
          </ng-container >
        </ul>
      </ng-container>
    </div>
    <ul>
      <li></li>
    </ul>

  `
})
export class AppComponent implements OnInit {
  dataModle: DataModel;

  title = 'app works!';
  constructor(private listService: ListService) { }

  ngOnInit(): void {
    const newModel = this.getSingleRequest();
    this.updateDataModel(newModel);
  }

  getSingleRequest(): DataModel {
    const RES = this.listService.getSingleResponse();

    return RES.response;
  }

  updateDataModel(newDataModel: DataModel) {
    const newCountries: Country[] = newDataModel.countries || [];
    const oldCountries: Country[] = this.dataModle.countries || [];
    newCountries.forEach((country, index) => {
      const i = this.findCountry(country);
      if (i === -1) {
        oldCountries.push(country);
      } else {
        this.updateCountry(oldCountries[i], country);
      }
    });
  }

  updateCountry(oldCountry: Country, newCountry: Country) {
    const newStates: State[] = newCountry.states || [];
    const oldStates: State[] = oldCountry.states || [];
    newStates.forEach((state, index) => {
      const i = this.findState(oldStates, state);
      if (i === -1) {
        oldStates.push(state);
      } else {
        this.updateState(oldStates[i], state);
      }
    });
  }

  updateState(oldState: State, newState: State) {
    oldState.cities = _.union(oldState.cities, newState.cities);
    oldState.cities.sort(function (a, b) {
      if (a < b) {
        return 1;
      }
      if (b < a) {
        return -1;
      }
      return 0;
    });
  }

  findCountry(target: Country) {
    const oldCountries: Country[] = this.dataModle.countries || [];
    if (oldCountries.length === 0) {
      return -1;
    }
    oldCountries.forEach((country, index) => {
      if (country.countryName === target.countryName) {
        return index;
      }
    });
    return -1;
  }


  findState(states: State[], target: State) {
    if (!states || states.length === 0) {
      return -1;
    }
    states.forEach((state, index) => {
      if (state.stateName === target.stateName) {
        return index;
      }
    });
    return -1;
  }
}
