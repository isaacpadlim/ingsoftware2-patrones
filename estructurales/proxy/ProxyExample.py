class Image:
    def display(self) -> None:
        raise NotImplementedError


class RealImage(Image):
    def __init__(self, filename: str) -> None:
        self.filename = filename
        self._load_from_disk()

    def _load_from_disk(self) -> None:
        print(f"Loading {self.filename} from disk...")

    def display(self) -> None:
        print(f"Displaying {self.filename}")


class ImageProxy(Image):
    def __init__(self, filename: str) -> None:
        self.filename = filename
        self._real: RealImage | None = None

    def display(self) -> None:
        # Lazy load: solo crea RealImage cuando se necesita
        if self._real is None:
            self._real = RealImage(self.filename)
        self._real.display()


if __name__ == "__main__":
    img = ImageProxy("photo.png")
    img.display()  # carga + muestra
    img.display()  # solo muestra (ya está cargada)
