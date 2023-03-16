.class public final enum Lk0/k;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk0/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lk0/k;

.field public static final enum o:Lk0/k;

.field public static final enum p:Lk0/k;

.field public static final enum q:Lk0/k;

.field public static final enum r:Lk0/k;

.field public static final enum s:Lk0/k;

.field private static final synthetic t:[Lk0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lk0/k;

    const-string v1, "NOT_REQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/k;->n:Lk0/k;

    new-instance v1, Lk0/k;

    const-string v3, "CONNECTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk0/k;->o:Lk0/k;

    new-instance v3, Lk0/k;

    const-string v5, "UNMETERED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk0/k;->p:Lk0/k;

    new-instance v5, Lk0/k;

    const-string v7, "NOT_ROAMING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lk0/k;->q:Lk0/k;

    new-instance v7, Lk0/k;

    const-string v9, "METERED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lk0/k;->r:Lk0/k;

    new-instance v9, Lk0/k;

    const-string v11, "TEMPORARILY_UNMETERED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lk0/k;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lk0/k;->s:Lk0/k;

    const/4 v11, 0x6

    new-array v11, v11, [Lk0/k;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lk0/k;->t:[Lk0/k;

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

.method public static valueOf(Ljava/lang/String;)Lk0/k;
    .locals 1

    const-class v0, Lk0/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk0/k;

    return-object p0
.end method

.method public static values()[Lk0/k;
    .locals 1

    sget-object v0, Lk0/k;->t:[Lk0/k;

    invoke-virtual {v0}, [Lk0/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/k;

    return-object v0
.end method
