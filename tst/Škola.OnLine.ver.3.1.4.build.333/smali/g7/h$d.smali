.class public final enum Lg7/h$d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/h$d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg7/h$d;",
        ">;",
        "Lcom/google/protobuf/a0$c;"
    }
.end annotation


# static fields
.field public static final enum o:Lg7/h$d;

.field public static final enum p:Lg7/h$d;

.field public static final enum q:Lg7/h$d;

.field public static final enum r:Lg7/h$d;

.field public static final enum s:Lg7/h$d;

.field public static final enum t:Lg7/h$d;

.field public static final enum u:Lg7/h$d;

.field public static final enum v:Lg7/h$d;

.field public static final enum w:Lg7/h$d;

.field public static final enum x:Lg7/h$d;

.field private static final y:Lcom/google/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$d<",
            "Lg7/h$d;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic z:[Lg7/h$d;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lg7/h$d;

    const-string v1, "HTTP_METHOD_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lg7/h$d;->o:Lg7/h$d;

    new-instance v1, Lg7/h$d;

    const-string v3, "GET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lg7/h$d;->p:Lg7/h$d;

    new-instance v3, Lg7/h$d;

    const-string v5, "PUT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lg7/h$d;->q:Lg7/h$d;

    new-instance v5, Lg7/h$d;

    const-string v7, "POST"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lg7/h$d;->r:Lg7/h$d;

    new-instance v7, Lg7/h$d;

    const-string v9, "DELETE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lg7/h$d;->s:Lg7/h$d;

    new-instance v9, Lg7/h$d;

    const-string v11, "HEAD"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lg7/h$d;->t:Lg7/h$d;

    new-instance v11, Lg7/h$d;

    const-string v13, "PATCH"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lg7/h$d;->u:Lg7/h$d;

    new-instance v13, Lg7/h$d;

    const-string v15, "OPTIONS"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lg7/h$d;->v:Lg7/h$d;

    new-instance v15, Lg7/h$d;

    const-string v14, "TRACE"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lg7/h$d;->w:Lg7/h$d;

    new-instance v14, Lg7/h$d;

    const-string v12, "CONNECT"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Lg7/h$d;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lg7/h$d;->x:Lg7/h$d;

    const/16 v12, 0xa

    new-array v12, v12, [Lg7/h$d;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    aput-object v14, v12, v10

    sput-object v12, Lg7/h$d;->z:[Lg7/h$d;

    new-instance v0, Lg7/h$d$a;

    invoke-direct {v0}, Lg7/h$d$a;-><init>()V

    sput-object v0, Lg7/h$d;->y:Lcom/google/protobuf/a0$d;

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

    iput p3, p0, Lg7/h$d;->n:I

    return-void
.end method

.method public static e(I)Lg7/h$d;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lg7/h$d;->x:Lg7/h$d;

    return-object p0

    :pswitch_1
    sget-object p0, Lg7/h$d;->w:Lg7/h$d;

    return-object p0

    :pswitch_2
    sget-object p0, Lg7/h$d;->v:Lg7/h$d;

    return-object p0

    :pswitch_3
    sget-object p0, Lg7/h$d;->u:Lg7/h$d;

    return-object p0

    :pswitch_4
    sget-object p0, Lg7/h$d;->t:Lg7/h$d;

    return-object p0

    :pswitch_5
    sget-object p0, Lg7/h$d;->s:Lg7/h$d;

    return-object p0

    :pswitch_6
    sget-object p0, Lg7/h$d;->r:Lg7/h$d;

    return-object p0

    :pswitch_7
    sget-object p0, Lg7/h$d;->q:Lg7/h$d;

    return-object p0

    :pswitch_8
    sget-object p0, Lg7/h$d;->p:Lg7/h$d;

    return-object p0

    :pswitch_9
    sget-object p0, Lg7/h$d;->o:Lg7/h$d;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g()Lcom/google/protobuf/a0$e;
    .locals 1

    sget-object v0, Lg7/h$d$b;->a:Lcom/google/protobuf/a0$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg7/h$d;
    .locals 1

    const-class v0, Lg7/h$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg7/h$d;

    return-object p0
.end method

.method public static values()[Lg7/h$d;
    .locals 1

    sget-object v0, Lg7/h$d;->z:[Lg7/h$d;

    invoke-virtual {v0}, [Lg7/h$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg7/h$d;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lg7/h$d;->n:I

    return v0
.end method
