import { BaseEntity } from './../../shared';

export class Order implements BaseEntity {
    constructor(
        public id?: string,
        public customerId?: string,
        public customerName?: string,
        public shippingDetail?: string,
        public productName?: string,
        public productDetail?: string,
        public productSize?: number,
        public productPrice?: number,
        public moneyPaid?: number,
        public status?: number,
        public note?: string,
        public createdDate?: Date,
        public lastModifiedDate?: Date
    ) {
    }
}
