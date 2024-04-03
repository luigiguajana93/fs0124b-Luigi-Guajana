import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormStandardComponent } from './form-standard.component';

describe('FormStandardComponent', () => {
  let component: FormStandardComponent;
  let fixture: ComponentFixture<FormStandardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FormStandardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormStandardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
