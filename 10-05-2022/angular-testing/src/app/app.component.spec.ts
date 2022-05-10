import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);  // identity of the component 
    const app = fixture.componentInstance;              // get the refernce of component 
    expect(app).toBeTruthy();                       // component reference created or not. 
  });

  it(`should have as title 'angular-testing'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('angular-testing');     // title variable value as angular-testing. 
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();    // load the DOM (template page)
    const compiled = fixture.nativeElement as HTMLElement;
    //expect(compiled.querySelector('.content span')?.textContent).toContain('angular-testing app is running!');
    expect(compiled.getElementsByTagName("h1")[0].textContent).toContain("Angular");
  });

  it("Property testing ",()=> {
    let obj = TestBed.createComponent(AppComponent).componentInstance;
    expect(obj.id).toEqual(100);
    expect(obj.name).toEqual("Raj Deep");
    expect(obj.result).toBeTrue();
    let res = obj.displayInfo("Ajay");
    expect(res).toContain("Ajay");
  })
});
