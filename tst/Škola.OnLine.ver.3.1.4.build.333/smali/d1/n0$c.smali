.class public final enum Ld1/n0$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld1/n0$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Ld1/n0$c;

.field public static final enum p:Ld1/n0$c;

.field public static final enum q:Ld1/n0$c;

.field public static final enum r:Ld1/n0$c;

.field public static final enum s:Ld1/n0$c;

.field public static final enum t:Ld1/n0$c;

.field private static final synthetic u:[Ld1/n0$c;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ld1/n0$c;

    const-string v1, "D"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/n0$c;->o:Ld1/n0$c;

    new-instance v1, Ld1/n0$c;

    const-string v3, "W"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ld1/n0$c;->p:Ld1/n0$c;

    new-instance v3, Ld1/n0$c;

    const-string v5, "E"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ld1/n0$c;->q:Ld1/n0$c;

    new-instance v5, Ld1/n0$c;

    const-string v7, "T"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ld1/n0$c;->r:Ld1/n0$c;

    new-instance v7, Ld1/n0$c;

    const-string v9, "I"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ld1/n0$c;->s:Ld1/n0$c;

    new-instance v9, Ld1/n0$c;

    const-string v11, "F"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Ld1/n0$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ld1/n0$c;->t:Ld1/n0$c;

    const/4 v11, 0x6

    new-array v11, v11, [Ld1/n0$c;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Ld1/n0$c;->u:[Ld1/n0$c;

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

    iput p3, p0, Ld1/n0$c;->n:I

    return-void
.end method

.method public static g(Ld1/b;)Ld1/n0$c;
    .locals 1

    sget-object v0, Ld1/n0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget-object p0, Ld1/n0$c;->o:Ld1/n0$c;

    return-object p0

    :pswitch_0
    sget-object p0, Ld1/n0$c;->t:Ld1/n0$c;

    return-object p0

    :pswitch_1
    sget-object p0, Ld1/n0$c;->s:Ld1/n0$c;

    return-object p0

    :pswitch_2
    sget-object p0, Ld1/n0$c;->r:Ld1/n0$c;

    return-object p0

    :pswitch_3
    sget-object p0, Ld1/n0$c;->q:Ld1/n0$c;

    return-object p0

    :pswitch_4
    sget-object p0, Ld1/n0$c;->p:Ld1/n0$c;

    return-object p0

    :pswitch_5
    sget-object p0, Ld1/n0$c;->o:Ld1/n0$c;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Ld1/n0$c;
    .locals 1

    const-class v0, Ld1/n0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld1/n0$c;

    return-object p0
.end method

.method public static values()[Ld1/n0$c;
    .locals 1

    sget-object v0, Ld1/n0$c;->u:[Ld1/n0$c;

    invoke-virtual {v0}, [Ld1/n0$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld1/n0$c;

    return-object v0
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, Ld1/n0$c;->n:I

    return v0
.end method
