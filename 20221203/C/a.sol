// SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract HotelBooking {
    address payable public ownner;

    enum Statuses {
        vacant,
        occupied
    }
    Statuses public currentStatuses;

    //ただのクラス
    constructor() {
        ownner = payable(msg.sender);
        currentStatuses = Statuses.vacant;
    }

    function booking() public payable {
        require(currentStatuses == Statuses.vacant, "Yoyakuzumi");
        require(msg.value >= 2, "Tarine");

        currentStatuses = Statuses.occupied;
        ownner.transfer(msg.value);
    }
}
