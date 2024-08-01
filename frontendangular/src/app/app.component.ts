// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'Myproject';
//   name: string;
//   age: number;
//   email: string;
//   txtColor: string;
//   img: string;
//   flag: boolean;
//   fname: string = " ";
//   vehicles: string[];
//   selectedVehicle: string = "";
//   myStyle: {};
//   myClass: string;

//   // Table Data
//   tableHeaders: string[] = ['Home', 'Contact', 'About Us'];

//   constructor() {
//     this.name = "Jeeva";
//     this.age = 20;
//     this.email = "bjeeva171@gmail.com.";
//     this.txtColor = "green";
//     this.img = "https://play-lh.googleusercontent.com/L6qehUCLcgG7W3cH1aBel04XKSp5GA9oX3NrUWgwaIwkiYWnhF-xJftIQz5m5Uy-0K67";
//     this.flag = true;
//     this.vehicles = ["TwoWheeler", "ThreeWheeler", "FourWheeler"];
//     this.myStyle = { 'width': '40%', 'border': '2px solid green' };
//     this.myClass = "MyClass1";
//   }

//   getAddition(a: number, b: number) {
//     let sum = a + b;
//     return sum;
//   }

//   getmul(a: number, b: number) {
//     let multiply = a * b;
//     return multiply;
//   }

//   changeName() {
//     this.name = "vino";
//   }

//   changeFlag() {
//     this.flag = !this.flag;
//   }

//   setSelectedItem(vec: string) {
//     this.selectedVehicle = vec;
//   }

//   changeClass() {
//     this.myClass = "MyClass2";
//   }
// }

import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  sum : number;
  constructor(private calc : CalculatorService){
    this.sum= calc.getAddition(190, 20);
  }

}
