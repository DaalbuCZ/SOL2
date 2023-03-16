.class public abstract enum Lf7/u;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lf7/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf7/u;",
        ">;",
        "Lf7/v;"
    }
.end annotation


# static fields
.field public static final enum n:Lf7/u;

.field public static final enum o:Lf7/u;

.field public static final enum p:Lf7/u;

.field public static final enum q:Lf7/u;

.field private static final synthetic r:[Lf7/u;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lf7/u$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf7/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/u;->n:Lf7/u;

    new-instance v1, Lf7/u$b;

    const-string v3, "LAZILY_PARSED_NUMBER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf7/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf7/u;->o:Lf7/u;

    new-instance v3, Lf7/u$c;

    const-string v5, "LONG_OR_DOUBLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lf7/u$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf7/u;->p:Lf7/u;

    new-instance v5, Lf7/u$d;

    const-string v7, "BIG_DECIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lf7/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lf7/u;->q:Lf7/u;

    const/4 v7, 0x4

    new-array v7, v7, [Lf7/u;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lf7/u;->r:[Lf7/u;

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

.method synthetic constructor <init>(Ljava/lang/String;ILf7/u$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/u;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf7/u;
    .locals 1

    const-class v0, Lf7/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf7/u;

    return-object p0
.end method

.method public static values()[Lf7/u;
    .locals 1

    sget-object v0, Lf7/u;->r:[Lf7/u;

    invoke-virtual {v0}, [Lf7/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf7/u;

    return-object v0
.end method
