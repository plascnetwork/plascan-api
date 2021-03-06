package org.tronscan.network

import org.joda.time.DateTime
import org.tronscan.network.NetworkScanner.full


case class NetworkNode(
  ip: String,
  port: Int,
  nodeType: Int = full,
  hostname: String = "",
  lastSeen: DateTime = DateTime.now,
  permanent: Boolean = false,
  lastBlock: Long = 0L,
  grpcEnabled: Boolean = false,
  grpcResponseTime: Long = 0,
  country: String = "",
  city: String = "",
  lat: Double = 0,
  lng: Double = 0)