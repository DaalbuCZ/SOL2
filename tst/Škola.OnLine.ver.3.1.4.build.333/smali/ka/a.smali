.class public final enum Lka/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lka/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lka/a;

.field public static final enum o:Lka/a;

.field public static final enum p:Lka/a;

.field public static final enum q:Lka/a;

.field public static final enum r:Lka/a;

.field public static final enum s:Lka/a;

.field public static final enum t:Lka/a;

.field private static final synthetic u:[Lka/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lka/a;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->n:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->o:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->p:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->q:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->r:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "CANCELED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->s:Lka/a;

    new-instance v0, Lka/a;

    const-string v1, "PAUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lka/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a;->t:Lka/a;

    invoke-static {}, Lka/a;->e()[Lka/a;

    move-result-object v0

    sput-object v0, Lka/a;->u:[Lka/a;

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

.method private static final synthetic e()[Lka/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lka/a;

    sget-object v1, Lka/a;->n:Lka/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->o:Lka/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->p:Lka/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->q:Lka/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->r:Lka/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->s:Lka/a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lka/a;->t:Lka/a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lka/a;
    .locals 1

    const-class v0, Lka/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/a;

    return-object p0
.end method

.method public static values()[Lka/a;
    .locals 1

    sget-object v0, Lka/a;->u:[Lka/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/a;

    return-object v0
.end method
