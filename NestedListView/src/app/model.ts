// State class representation
export class State {
 stateName: string;
 cities: string[];
}

// Country class representation
export class Country {
  countryName: string;
  states: State[];
}

export class Response {
  response: DataModel;
}

export class DataModel {
  countries: Country[];
}
