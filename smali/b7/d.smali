.class public final enum Lb7/d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/d;",
        ">;",
        "Lcom/google/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum o:Lb7/d;

.field public static final enum p:Lb7/d;

.field public static final enum q:Lb7/d;

.field public static final enum r:Lb7/d;

.field private static final s:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "Lb7/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic t:[Lb7/d;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lb7/d;

    const-string v1, "APPLICATION_PROCESS_STATE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb7/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb7/d;->o:Lb7/d;

    new-instance v1, Lb7/d;

    const-string v3, "FOREGROUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lb7/d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb7/d;->p:Lb7/d;

    new-instance v3, Lb7/d;

    const-string v5, "BACKGROUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lb7/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lb7/d;->q:Lb7/d;

    new-instance v5, Lb7/d;

    const-string v7, "FOREGROUND_BACKGROUND"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lb7/d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lb7/d;->r:Lb7/d;

    const/4 v7, 0x4

    new-array v7, v7, [Lb7/d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lb7/d;->t:[Lb7/d;

    new-instance v0, Lb7/d$a;

    invoke-direct {v0}, Lb7/d$a;-><init>()V

    sput-object v0, Lb7/d;->s:Lcom/google/protobuf/a0$d;

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

    iput p3, p0, Lb7/d;->n:I

    return-void
.end method

.method public static e(I)Lb7/d;
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
    sget-object p0, Lb7/d;->r:Lb7/d;

    return-object p0

    :cond_1
    sget-object p0, Lb7/d;->q:Lb7/d;

    return-object p0

    :cond_2
    sget-object p0, Lb7/d;->p:Lb7/d;

    return-object p0

    :cond_3
    sget-object p0, Lb7/d;->o:Lb7/d;

    return-object p0
.end method

.method public static g()Lcom/google/protobuf/a0$e;
    .locals 1

    sget-object v0, Lb7/d$b;->a:Lcom/google/protobuf/a0$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/d;
    .locals 1

    const-class v0, Lb7/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/d;

    return-object p0
.end method

.method public static values()[Lb7/d;
    .locals 1

    sget-object v0, Lb7/d;->t:[Lb7/d;

    invoke-virtual {v0}, [Lb7/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/d;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lb7/d;->n:I

    return v0
.end method
