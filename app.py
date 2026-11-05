
# Python Application

def welcome_message():
    print("=" * 40)
    print("Hello from Python Application")

    name = "VVCE"

    print("Welcome to", name)
    print("Application executed successfully")
    print("=" * 40)


def main():
    try:
        welcome_message()
        print("Jenkins CI Pipeline Integration Ready!")
        print("Build Status: SUCCESS")

    except Exception as error:
        print("Application Error:", error)
        raise


if __name__ == "__main__":
    main()
