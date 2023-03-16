.class public final enum Lca/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lca/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lca/a;

.field public static final enum o:Lca/a;

.field public static final enum p:Lca/a;

.field public static final enum q:Lca/a;

.field public static final enum r:Lca/a;

.field public static final enum s:Lca/a;

.field public static final enum t:Lca/a;

.field private static final synthetic u:[Lca/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lca/a;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->n:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->o:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->p:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->q:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->r:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "CANCELED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->s:Lca/a;

    new-instance v0, Lca/a;

    const-string v1, "PAUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lca/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lca/a;->t:Lca/a;

    invoke-static {}, Lca/a;->e()[Lca/a;

    move-result-object v0

    sput-object v0, Lca/a;->u:[Lca/a;

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

.method private static final synthetic e()[Lca/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lca/a;

    sget-object v1, Lca/a;->n:Lca/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->o:Lca/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->p:Lca/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->q:Lca/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->r:Lca/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->s:Lca/a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lca/a;->t:Lca/a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lca/a;
    .locals 1

    const-class v0, Lca/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lca/a;

    return-object p0
.end method

.method public static values()[Lca/a;
    .locals 1

    sget-object v0, Lca/a;->u:[Lca/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lca/a;

    return-object v0
.end method
