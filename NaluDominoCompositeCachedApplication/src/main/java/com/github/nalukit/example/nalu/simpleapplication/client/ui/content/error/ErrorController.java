/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.example.nalu.simpleapplication.client.ui.content.error;

import com.github.nalukit.example.nalu.simpleapplication.client.NaluSimpleApplicationContext;
import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.AbstractErrorPopUpComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.github.nalukit.nalu.client.component.annotation.ErrorPopUpController;
import elemental2.dom.HTMLElement;

import java.util.Objects;

@ErrorPopUpController(component = ErrorComponent.class,
                      componentInterface = IErrorComponent.class)
public class ErrorController
    extends AbstractErrorPopUpComponentController<NaluSimpleApplicationContext, IErrorComponent>
    implements IErrorComponent.Controller {

  public ErrorController() {
  }

  @Override
  public void onBeforeShow() {
    this.component.clear();
  }

  @Override
  protected void show() {
    // this only works, cause the get method is not asynchron!
    this.component.edit(this.errorEventType,
                        this.route,
                        this.message,
                        this.dataStore);
    this.component.show();
  }

//  @Override
//  public void doRouteHome() {
//    // clear the error message to avoid showing it again!
//    this.router.clearNaluErrorMessage();
//    // route to the search screen
//    this.router.route("/application/person/search");
//  }

}
