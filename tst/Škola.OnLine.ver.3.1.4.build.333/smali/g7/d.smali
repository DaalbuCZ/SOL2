.class public final enum Lg7/d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg7/d;",
        ">;",
        "Lcom/google/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum o:Lg7/d;

.field public static final enum p:Lg7/d;

.field public static final enum q:Lg7/d;

.field public static final enum r:Lg7/d;

.field private static final s:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "Lg7/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic t:[Lg7/d;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lg7/d;

    const-string v1, "APPLICATION_PROCESS_STATE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lg7/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lg7/d;->o:Lg7/d;

    new-instance v1, Lg7/d;

    const-string v3, "FOREGROUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lg7/d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lg7/d;->p:Lg7/d;

    new-instance v3, Lg7/d;

    const-string v5, "BACKGROUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lg7/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lg7/d;->q:Lg7/d;

    new-instance v5, Lg7/d;

    const-string v7, "FOREGROUND_BACKGROUND"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lg7/d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lg7/d;->r:Lg7/d;

    const/4 v7, 0x4

    new-array v7, v7, [Lg7/d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lg7/d;->t:[Lg7/d;

    new-instance v0, Lg7/d$a;

    invoke-direct {v0}, Lg7/d$a;-><init>()V

    sput-object v0, Lg7/d;->s:Lcom/google/protobuf/a0$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lg7/d;->n:I

    return-void
.end method

.method public static e(I)Lg7/d;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lg7/d;->r:Lg7/d;

    return-object p0

    :cond_1
    sget-object p0, Lg7/d;->q:Lg7/d;

    return-object p0

    :cond_2
    sget-object p0, Lg7/d;->p:Lg7/d;

    return-object p0

    :cond_3
    sget-object p0, Lg7/d;->o:Lg7/d;

    return-object p0
.end method

.method public static g()Lcom/google/protobuf/a0$e;
    .locals 1

    sget-object v0, Lg7/d$b;->a:Lcom/google/protobuf/a0$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/d;
    .locals 1

    const-class v0, Lg7/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/d;

    return-object p0
.end method

.method public static values()[Lg7/d;
    .locals 1

    sget-object v0, Lg7/d;->t:[Lg7/d;

    invoke-virtual {v0}, [Lg7/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/d;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lg7/d;->n:I

    return v0
.end method
