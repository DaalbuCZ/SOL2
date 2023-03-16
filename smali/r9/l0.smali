.class public final enum Lr9/l0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/l0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr9/l0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lr9/l0;

.field public static final enum o:Lr9/l0;

.field public static final enum p:Lr9/l0;

.field public static final enum q:Lr9/l0;

.field private static final synthetic r:[Lr9/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr9/l0;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr9/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/l0;->n:Lr9/l0;

    new-instance v0, Lr9/l0;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr9/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/l0;->o:Lr9/l0;

    new-instance v0, Lr9/l0;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lr9/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/l0;->p:Lr9/l0;

    new-instance v0, Lr9/l0;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lr9/l0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr9/l0;->q:Lr9/l0;

    invoke-static {}, Lr9/l0;->e()[Lr9/l0;

    move-result-object v0

    sput-object v0, Lr9/l0;->r:[Lr9/l0;

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

.method private static final synthetic e()[Lr9/l0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lr9/l0;

    sget-object v1, Lr9/l0;->n:Lr9/l0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lr9/l0;->o:Lr9/l0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lr9/l0;->p:Lr9/l0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lr9/l0;->q:Lr9/l0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr9/l0;
    .locals 1

    const-class v0, Lr9/l0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr9/l0;

    return-object p0
.end method

.method public static values()[Lr9/l0;
    .locals 1

    sget-object v0, Lr9/l0;->r:[Lr9/l0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr9/l0;

    return-object v0
.end method


# virtual methods
.method public final g(Lj9/p;Ljava/lang/Object;Lb9/d;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/p<",
            "-TR;-",
            "Lb9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lb9/d<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lr9/l0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ly8/k;

    invoke-direct {p1}, Ly8/k;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2, p3}, Lw9/b;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Lb9/f;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)V

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lw9/a;->d(Lj9/p;Ljava/lang/Object;Lb9/d;Lj9/l;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final h()Z
    .locals 1

    sget-object v0, Lr9/l0;->o:Lr9/l0;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
