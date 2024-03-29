export interface iPhone {
  id: number
  title: string
  description: string
  price: number
  discountPercentage: number
  rating: number
  stock: number
  brand: string
  category: string
  thumbnail: string
  images: string[]
}

export interface Product{
  products: iPhone[]
  total:number
  skip:number
  limit:number
}
