/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.websocket.ee.javax.websocket.containerprovider.metainf;

import com.sun.ts.tests.websocket.common.client.WebSocketCommonClient;

/*
 * @class.setup_props: webServerHost;
 *                     webServerPort;
 *                     ts_home;
 *                     ws_wait;
 */
public class WSClient extends WebSocketCommonClient {
  private static final long serialVersionUID = 8387217970724424176L;

  public WSClient() {
    setContextRoot("wsc_ee_containerprovider_metainf_web");
  }

  public static void main(String[] args) {
    new WSClient().run(args);
  }

  /* Run test */
  /*
   * @testName: getWebSocketContainerOnServerTest
   * 
   * @assertion_ids: WebSocket:JAVADOC:28; WebSocket:JAVADOC:27;
   * 
   * @test_Strategy: Check the TCKContainerProvider is used, as order by
   * META-INF/services/javax.websocket.ContainerProvider file
   * 
   * ContainerProvider.ContainerProvider()
   */
  public void getWebSocketContainerOnServerTest() throws Fault {
    invoke("srv", "anything", TCKWebSocketContainer.class.getName());
  }

}
