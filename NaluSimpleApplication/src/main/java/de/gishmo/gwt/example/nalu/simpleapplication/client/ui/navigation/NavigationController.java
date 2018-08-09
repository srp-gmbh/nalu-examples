/*
 * Copyright (c) 2018 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 *
 */

package de.gishmo.gwt.example.nalu.simpleapplication.client.ui.navigation;

import com.github.mvp4g.nalu.client.ui.AbstractComponentController;
import com.github.mvp4g.nalu.client.ui.annotation.Controller;
import de.gishmo.gwt.example.nalu.simpleapplication.client.NaluSimpleApplicationContext;
import de.gishmo.gwt.example.nalu.simpleapplication.client.ui.Selectors;

@Controller(route = "/", selector = Selectors.NAVIGATION, componentInterface = INavigationComponent.class, component = NavigationComponent.class)
public class NavigationController
  extends AbstractComponentController<NaluSimpleApplicationContext, INavigationComponent>
  implements INavigationComponent.Controller {


  public NavigationController() {
  }

  @Override
  public void doShowSearch() {
    this.router.route("/search",
                      this.context.getSearchName(),
                      this.context.getSearchCity());
  }

  @Override
  public void doShowList() {
    this.router.route("/list",
                      this.context.getSearchName(),
                      this.context.getSearchCity());
  }
}
