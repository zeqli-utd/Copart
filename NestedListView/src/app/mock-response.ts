import {State} from './model';

export const RESPONSE_1 = {
  response: {
    countries: [
      {
        countryName : 'US',
        states: [
          {
            stateName : 'TX',
            cities: [
              { cityName: 'Plano'},
              { cityName: 'Richardson'},
              { cityName: 'Dallas'}
            ]
          },
          {
            stateName : 'CA',
            cities: [
              { cityName: 'Irvine'},
              { cityName: 'Los Angeles'},
              { cityName: 'San Jose'}
            ]
          }
        ]
      }
    ]
  }
};

export const TX: State = {
  stateName: 'TX',
  cities: ['Plano', 'Richardson', 'Dallas']
};

export const CA: State = {
  stateName: 'CA',
  cities: ['Irvine',  'Los Angeles', 'San Jose']
};

export const RESPONSE_2 = {
  response: {
    countries: [ { countryName : 'US', states: [ TX, CA ] }
    ]
  }
};

