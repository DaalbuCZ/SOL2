.class public final enum Ls1/g$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls1/g$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ls1/g$c;

.field public static final enum o:Ls1/g$c;

.field public static final enum p:Ls1/g$c;

.field private static final synthetic q:[Ls1/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ls1/g$c;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls1/g$c;->n:Ls1/g$c;

    new-instance v1, Ls1/g$c;

    const-string v3, "DEVICE_IDLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls1/g$c;->o:Ls1/g$c;

    new-instance v3, Ls1/g$c;

    const-string v5, "DEVICE_CHARGING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ls1/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls1/g$c;->p:Ls1/g$c;

    const/4 v5, 0x3

    new-array v5, v5, [Ls1/g$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ls1/g$c;->q:[Ls1/g$c;

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

.method public static valueOf(Ljava/lang/String;)Ls1/g$c;
    .locals 1

    const-class v0, Ls1/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls1/g$c;

    return-object p0
.end method

.method public static values()[Ls1/g$c;
    .locals 1

    sget-object v0, Ls1/g$c;->q:[Ls1/g$c;

    invoke-virtual {v0}, [Ls1/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls1/g$c;

    return-object v0
.end method
