/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */

package com.sun.ts.tests.interop.ejb.entity.bmp.clientviewtest;

import javax.ejb.*;
import java.util.*;
import java.rmi.*;
import java.util.Properties;

public interface TestBeanHome extends EJBHome {
  public TestBean create(Properties p, boolean newTable, int cofID,
      String cofName, float cofPrice) throws RemoteException, CreateException;

  public TestBean findTheBean(Properties p, Integer key)
      throws RemoteException, FinderException;

  public TestBean findByPrimaryKey(Integer key)
      throws RemoteException, FinderException;

  public Collection findByName(Properties p, String name)
      throws RemoteException, FinderException;

  public Collection findByPrice(Properties p, float price)
      throws RemoteException, FinderException;

  public Collection findWithinPriceRange(Properties p, float pmin, float pmax)
      throws RemoteException, FinderException;

  public Collection findWithinPrimaryKeyRange(Properties p, Integer kmin,
      Integer kmax) throws RemoteException, FinderException;
}
