.class public final enum Lp0/n;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp0/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lp0/n;

.field public static final enum o:Lp0/n;

.field private static final synthetic p:[Lp0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lp0/n;

    const-string v1, "RUN_AS_NON_EXPEDITED_WORK_REQUEST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp0/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp0/n;->n:Lp0/n;

    new-instance v1, Lp0/n;

    const-string v3, "DROP_WORK_REQUEST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lp0/n;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lp0/n;->o:Lp0/n;

    const/4 v3, 0x2

    new-array v3, v3, [Lp0/n;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lp0/n;->p:[Lp0/n;

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

.method public static valueOf(Ljava/lang/String;)Lp0/n;
    .locals 1

    const-class v0, Lp0/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp0/n;

    return-object p0
.end method

.method public static values()[Lp0/n;
    .locals 1

    sget-object v0, Lp0/n;->p:[Lp0/n;

    invoke-virtual {v0}, [Lp0/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp0/n;

    return-object v0
.end method
