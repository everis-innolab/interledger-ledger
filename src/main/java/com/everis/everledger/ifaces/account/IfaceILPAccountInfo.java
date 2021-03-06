package com.everis.everledger.ifaces.account;

import org.interledger.InterledgerAddress;

import java.security.PublicKey;
import javax.money.MonetaryAmount;


/**
 * Defines information about a given aProtocolccount.
 */
public interface IfaceILPAccountInfo {

  /**
   * Returns the ILP address of the ledger on which the account is held.
   */
  InterledgerAddress getILPLedger();

  /**
   * Returns a unique identifier for the account with respect to the ledger.
   */
  String getId();

  /**
   * Returns a human-readable account name.
   */
  String getName();

  /**
   * Returns the Interledger address of the account.
   */
  InterledgerAddress getAddress();


  /**
   * Returns the current balance of the account.
   */
  MonetaryAmount getILPBalance();

  /**
   * Flag indicating if the account is currently able to transact.
   *
   * @return true if the account is disabled.
   */
  boolean isDisabled();

  /**
   * Returns the fingerprint of the account certificate.
   */
  byte[] getCertificateFingerprint();

  /**
   * Returns the minimum allowed balance for the account, or null if there is no limit.
   */
  MonetaryAmount getILPMinimumAllowedBalance();

  /**
   * Returns the public key for this account.
   */
  PublicKey getPublicKey();

}
