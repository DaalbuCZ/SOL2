.class abstract enum Lg5/y$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lf5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg5/y$b;",
        ">;",
        "Lf5/f<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lg5/y$b;

.field public static final enum o:Lg5/y$b;

.field private static final synthetic p:[Lg5/y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg5/y$b$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg5/y$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg5/y$b;->n:Lg5/y$b;

    new-instance v0, Lg5/y$b$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg5/y$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg5/y$b;->o:Lg5/y$b;

    invoke-static {}, Lg5/y$b;->e()[Lg5/y$b;

    move-result-object v0

    sput-object v0, Lg5/y$b;->p:[Lg5/y$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILg5/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg5/y$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lg5/y$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lg5/y$b;

    sget-object v1, Lg5/y$b;->n:Lg5/y$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lg5/y$b;->o:Lg5/y$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg5/y$b;
    .locals 1

    const-class v0, Lg5/y$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg5/y$b;

    return-object p0
.end method

.method public static values()[Lg5/y$b;
    .locals 1

    sget-object v0, Lg5/y$b;->p:[Lg5/y$b;

    invoke-virtual {v0}, [Lg5/y$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg5/y$b;

    return-object v0
.end method
