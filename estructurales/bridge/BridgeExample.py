class Device:
    """Implementor"""
    def is_on(self) -> bool:
        raise NotImplementedError

    def power_on(self) -> None:
        raise NotImplementedError

    def power_off(self) -> None:
        raise NotImplementedError


class TV(Device):
    def __init__(self) -> None:
        self._on = False

    def is_on(self) -> bool:
        return self._on

    def power_on(self) -> None:
        self._on = True
        print("TV: ON")

    def power_off(self) -> None:
        self._on = False
        print("TV: OFF")


class Radio(Device):
    def __init__(self) -> None:
        self._on = False

    def is_on(self) -> bool:
        return self._on

    def power_on(self) -> None:
        self._on = True
        print("Radio: ON")

    def power_off(self) -> None:
        self._on = False
        print("Radio: OFF")


class RemoteControl:
    """Abstraction (bridge to Device)"""
    def __init__(self, device: Device) -> None:
        self.device = device

    def toggle_power(self) -> None:
        if self.device.is_on():
            self.device.power_off()
        else:
            self.device.power_on()


if __name__ == "__main__":
    remote_tv = RemoteControl(TV())
    remote_tv.toggle_power()
    remote_tv.toggle_power()

    remote_radio = RemoteControl(Radio())
    remote_radio.toggle_power()