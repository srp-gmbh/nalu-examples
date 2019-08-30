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

package de.gishmo.example.devk.client.ui.application.content.detail.composite.address;

import com.github.nalukit.nalu.client.component.AbstractCompositeController;
import com.github.nalukit.nalu.client.component.annotation.CompositeController;
import de.gishmo.example.devk.client.ApplicationContext;
import de.gishmo.example.devk.shared.model.dto.Person;
import elemental2.dom.HTMLElement;

@CompositeController(componentInterface = IAddressComponent.class,
                     component = AddressComponent.class)
public class AddressComposite
    extends AbstractCompositeController<ApplicationContext, IAddressComponent, HTMLElement>
    implements IAddressComponent.Controller {

  public AddressComposite() {
  }

  public boolean isDirty(Person person) {
    return this.component.isDirty(person);
  }

  public void edit(Person person) {
    this.component.edit(person);
  }

  public Person flush(Person person) {
    return this.component.flush(person);
  }
}