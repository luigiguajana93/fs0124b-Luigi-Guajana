import { iPost } from "./posts";

export interface Oggetto {
  posts:iPost[]
  total:number
  skip:number
  limit:number
}
