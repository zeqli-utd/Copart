import { Injectable } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import { Response } from './model';
import {RESPONSE_2} from './mock-response';

@Injectable()
export class ListService {
  getSingleResponse(): Response {   // Stub
    return RESPONSE_2;
  }
}
