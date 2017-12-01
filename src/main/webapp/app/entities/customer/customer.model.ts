import { BaseEntity } from './../../shared';

export class Customer implements BaseEntity {
    constructor(
        public id?: string,
        public name?: string,
        public facebook?: string,
        public phone?: string,
    ) {
    }
}
