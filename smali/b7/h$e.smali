.class public final enum Lb7/h$e;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/h$e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/h$e;",
        ">;",
        "Lcom/google/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum o:Lb7/h$e;

.field public static final enum p:Lb7/h$e;

.field private static final q:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "Lb7/h$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic r:[Lb7/h$e;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lb7/h$e;

    const-string v1, "NETWORK_CLIENT_ERROR_REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb7/h$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb7/h$e;->o:Lb7/h$e;

    new-instance v1, Lb7/h$e;

    const-string v3, "GENERIC_CLIENT_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lb7/h$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb7/h$e;->p:Lb7/h$e;

    const/4 v3, 0x2

    new-array v3, v3, [Lb7/h$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lb7/h$e;->r:[Lb7/h$e;

    new-instance v0, Lb7/h$e$a;

    invoke-direct {v0}, Lb7/h$e$a;-><init>()V

    sput-object v0, Lb7/h$e;->q:Lcom/google/protobuf/a0$d;

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

    iput p3, p0, Lb7/h$e;->n:I

    return-void
.end method

.method public static e(I)Lb7/h$e;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lb7/h$e;->p:Lb7/h$e;

    return-object p0

    :cond_1
    sget-object p0, Lb7/h$e;->o:Lb7/h$e;

    return-object p0
.end method

.method public static g()Lcom/google/protobuf/a0$e;
    .locals 1

    sget-object v0, Lb7/h$e$b;->a:Lcom/google/protobuf/a0$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/h$e;
    .locals 1

    const-class v0, Lb7/h$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/h$e;

    return-object p0
.end method

.method public static values()[Lb7/h$e;
    .locals 1

    sget-object v0, Lb7/h$e;->r:[Lb7/h$e;

    invoke-virtual {v0}, [Lb7/h$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/h$e;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lb7/h$e;->n:I

    return v0
.end method
