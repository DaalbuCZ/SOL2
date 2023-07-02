.class public abstract enum Lk7/t;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk7/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lk7/t;

.field public static final enum o:Lk7/t;

.field private static final synthetic p:[Lk7/t;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lk7/t$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk7/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk7/t;->n:Lk7/t;

    new-instance v1, Lk7/t$b;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk7/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk7/t;->o:Lk7/t;

    const/4 v3, 0x2

    new-array v3, v3, [Lk7/t;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lk7/t;->p:[Lk7/t;

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

.method synthetic constructor <init>(Ljava/lang/String;ILk7/t$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk7/t;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk7/t;
    .locals 1

    const-class v0, Lk7/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk7/t;

    return-object p0
.end method

.method public static values()[Lk7/t;
    .locals 1

    sget-object v0, Lk7/t;->p:[Lk7/t;

    invoke-virtual {v0}, [Lk7/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk7/t;

    return-object v0
.end method
