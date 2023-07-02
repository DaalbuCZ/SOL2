.class public final enum Lv6/c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv6/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lv6/c;

.field public static final enum o:Lv6/c;

.field private static final synthetic p:[Lv6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lv6/c;

    const-string v1, "LOW_POWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv6/c;->n:Lv6/c;

    new-instance v1, Lv6/c;

    const-string v3, "HIGH_SPEED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lv6/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lv6/c;->o:Lv6/c;

    const/4 v3, 0x2

    new-array v3, v3, [Lv6/c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lv6/c;->p:[Lv6/c;

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

.method public static valueOf(Ljava/lang/String;)Lv6/c;
    .locals 1

    const-class v0, Lv6/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv6/c;

    return-object p0
.end method

.method public static values()[Lv6/c;
    .locals 1

    sget-object v0, Lv6/c;->p:[Lv6/c;

    invoke-virtual {v0}, [Lv6/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv6/c;

    return-object v0
.end method
