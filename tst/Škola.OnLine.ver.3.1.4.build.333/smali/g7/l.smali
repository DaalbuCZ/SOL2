.class public final enum Lg7/l;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg7/l;",
        ">;",
        "Lcom/google/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum o:Lg7/l;

.field public static final enum p:Lg7/l;

.field private static final q:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "Lg7/l;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic r:[Lg7/l;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lg7/l;

    const-string v1, "SESSION_VERBOSITY_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lg7/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lg7/l;->o:Lg7/l;

    new-instance v1, Lg7/l;

    const-string v3, "GAUGES_AND_SYSTEM_EVENTS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lg7/l;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lg7/l;->p:Lg7/l;

    const/4 v3, 0x2

    new-array v3, v3, [Lg7/l;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lg7/l;->r:[Lg7/l;

    new-instance v0, Lg7/l$a;

    invoke-direct {v0}, Lg7/l$a;-><init>()V

    sput-object v0, Lg7/l;->q:Lcom/google/protobuf/a0$d;

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

    iput p3, p0, Lg7/l;->n:I

    return-void
.end method

.method public static e(I)Lg7/l;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lg7/l;->p:Lg7/l;

    return-object p0

    :cond_1
    sget-object p0, Lg7/l;->o:Lg7/l;

    return-object p0
.end method

.method public static g()Lcom/google/protobuf/a0$e;
    .locals 1

    sget-object v0, Lg7/l$b;->a:Lcom/google/protobuf/a0$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/l;
    .locals 1

    const-class v0, Lg7/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/l;

    return-object p0
.end method

.method public static values()[Lg7/l;
    .locals 1

    sget-object v0, Lg7/l;->r:[Lg7/l;

    invoke-virtual {v0}, [Lg7/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/l;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lg7/l;->n:I

    return v0
.end method
