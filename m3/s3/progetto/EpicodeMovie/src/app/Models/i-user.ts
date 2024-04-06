import { IPopular } from "./i-popular"

export interface IUser {
  id: number
  firstName: string
  lastName: string
  email: string
  password?:string
  favorite?:IPopular[]
}
