.class public abstract enum Lk7/u;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lk7/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk7/u;",
        ">;",
        "Lk7/v;"
    }
.end annotation


# static fields
.field public static final enum n:Lk7/u;

.field public static final enum o:Lk7/u;

.field public static final enum p:Lk7/u;

.field public static final enum q:Lk7/u;

.field private static final synthetic r:[Lk7/u;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lk7/u$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk7/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk7/u;->n:Lk7/u;

    new-instance v1, Lk7/u$b;

    const-string v3, "LAZILY_PARSED_NUMBER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk7/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk7/u;->o:Lk7/u;

    new-instance v3, Lk7/u$c;

    const-string v5, "LONG_OR_DOUBLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk7/u$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk7/u;->p:Lk7/u;

    new-instance v5, Lk7/u$d;

    const-string v7, "BIG_DECIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lk7/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lk7/u;->q:Lk7/u;

    const/4 v7, 0x4

    new-array v7, v7, [Lk7/u;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lk7/u;->r:[Lk7/u;

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

.method synthetic constructor <init>(Ljava/lang/String;ILk7/u$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk7/u;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk7/u;
    .locals 1

    const-class v0, Lk7/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk7/u;

    return-object p0
.end method

.method public static values()[Lk7/u;
    .locals 1

    sget-object v0, Lk7/u;->r:[Lk7/u;

    invoke-virtual {v0}, [Lk7/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk7/u;

    return-object v0
.end method
