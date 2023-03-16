.class public final enum Lk0/s;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk0/s;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lk0/s;

.field public static final enum o:Lk0/s;

.field public static final enum p:Lk0/s;

.field public static final enum q:Lk0/s;

.field public static final enum r:Lk0/s;

.field public static final enum s:Lk0/s;

.field private static final synthetic t:[Lk0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lk0/s;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/s;->n:Lk0/s;

    new-instance v1, Lk0/s;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk0/s;->o:Lk0/s;

    new-instance v3, Lk0/s;

    const-string v5, "SUCCEEDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk0/s;->p:Lk0/s;

    new-instance v5, Lk0/s;

    const-string v7, "FAILED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lk0/s;->q:Lk0/s;

    new-instance v7, Lk0/s;

    const-string v9, "BLOCKED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lk0/s;->r:Lk0/s;

    new-instance v9, Lk0/s;

    const-string v11, "CANCELLED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lk0/s;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lk0/s;->s:Lk0/s;

    const/4 v11, 0x6

    new-array v11, v11, [Lk0/s;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lk0/s;->t:[Lk0/s;

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

.method public static valueOf(Ljava/lang/String;)Lk0/s;
    .locals 1

    const-class v0, Lk0/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk0/s;

    return-object p0
.end method

.method public static values()[Lk0/s;
    .locals 1

    sget-object v0, Lk0/s;->t:[Lk0/s;

    invoke-virtual {v0}, [Lk0/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/s;

    return-object v0
.end method


# virtual methods
.method public e()Z
    .locals 1

    sget-object v0, Lk0/s;->p:Lk0/s;

    if-eq p0, v0, :cond_1

    sget-object v0, Lk0/s;->q:Lk0/s;

    if-eq p0, v0, :cond_1

    sget-object v0, Lk0/s;->s:Lk0/s;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
