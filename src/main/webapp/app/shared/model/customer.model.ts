export interface ICustomer {
  id?: number;
  lineUserId?: string;
  nickname?: string;
  useLanguage?: string;
}

export class Customer implements ICustomer {
  constructor(public id?: number, public lineUserId?: string, public nickname?: string, public useLanguage?: string) {}
}
