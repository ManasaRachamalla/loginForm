import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

   user = new User();
   msg = '';
  constructor(private _service:LoginService , private _router:Router) { }

  ngOnInit(): void {
  }

  loginUser()
  {
      this._service.loginUserFromRemote(this.user).subscribe(
      data => {
        console.log("response received");
        this._router.navigate(['/loginsuccess'])
      } , 
      
      error => {
        console.log("exception occured");
        this.msg="Bad credentials , Please provide valid one";
    }
    )
  }

}
