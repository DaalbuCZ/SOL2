.class public final enum Ly0/k0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly0/k0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Ly0/k0;

.field public static final enum p:Ly0/k0;

.field public static final enum q:Ly0/k0;

.field public static final enum r:Ly0/k0;

.field public static final enum s:Ly0/k0;

.field public static final enum t:Ly0/k0;

.field public static final enum u:Ly0/k0;

.field private static final synthetic v:[Ly0/k0;


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ly0/k0;

    const-string v1, "VERBOSE"

    const/4 v2, 0x0

    const-string v3, "V"

    invoke-direct {v0, v1, v2, v3}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/k0;->o:Ly0/k0;

    new-instance v1, Ly0/k0;

    const-string v3, "DEBUG"

    const/4 v4, 0x1

    const-string v5, "D"

    invoke-direct {v1, v3, v4, v5}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly0/k0;->p:Ly0/k0;

    new-instance v3, Ly0/k0;

    const-string v5, "INFO"

    const/4 v6, 0x2

    const-string v7, "I"

    invoke-direct {v3, v5, v6, v7}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly0/k0;->q:Ly0/k0;

    new-instance v5, Ly0/k0;

    const-string v7, "WARNING"

    const/4 v8, 0x3

    const-string v9, "W"

    invoke-direct {v5, v7, v8, v9}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ly0/k0;->r:Ly0/k0;

    new-instance v7, Ly0/k0;

    const-string v9, "ERROR"

    const/4 v10, 0x4

    const-string v11, "E"

    invoke-direct {v7, v9, v10, v11}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Ly0/k0;->s:Ly0/k0;

    new-instance v9, Ly0/k0;

    const-string v11, "ASSERT"

    const/4 v12, 0x5

    const-string v13, "A"

    invoke-direct {v9, v11, v12, v13}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Ly0/k0;->t:Ly0/k0;

    new-instance v11, Ly0/k0;

    const-string v13, "WTF"

    const/4 v14, 0x6

    const-string v15, "F"

    invoke-direct {v11, v13, v14, v15}, Ly0/k0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Ly0/k0;->u:Ly0/k0;

    const/4 v13, 0x7

    new-array v13, v13, [Ly0/k0;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Ly0/k0;->v:[Ly0/k0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly0/k0;->n:Ljava/lang/String;

    return-void
.end method

.method public static e(C)Ly0/k0;
    .locals 1

    const/16 v0, 0x41

    if-eq p0, v0, :cond_5

    const/16 v0, 0x49

    if-eq p0, v0, :cond_4

    const/16 v0, 0x45

    if-eq p0, v0, :cond_3

    const/16 v0, 0x46

    if-eq p0, v0, :cond_2

    const/16 v0, 0x56

    if-eq p0, v0, :cond_1

    const/16 v0, 0x57

    if-eq p0, v0, :cond_0

    sget-object p0, Ly0/k0;->p:Ly0/k0;

    goto :goto_0

    :cond_0
    sget-object p0, Ly0/k0;->r:Ly0/k0;

    goto :goto_0

    :cond_1
    sget-object p0, Ly0/k0;->o:Ly0/k0;

    goto :goto_0

    :cond_2
    sget-object p0, Ly0/k0;->u:Ly0/k0;

    goto :goto_0

    :cond_3
    sget-object p0, Ly0/k0;->s:Ly0/k0;

    goto :goto_0

    :cond_4
    sget-object p0, Ly0/k0;->q:Ly0/k0;

    goto :goto_0

    :cond_5
    sget-object p0, Ly0/k0;->t:Ly0/k0;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ly0/k0;
    .locals 1

    const-class v0, Ly0/k0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/k0;

    return-object p0
.end method

.method public static values()[Ly0/k0;
    .locals 1

    sget-object v0, Ly0/k0;->v:[Ly0/k0;

    invoke-virtual {v0}, [Ly0/k0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/k0;

    return-object v0
.end method


# virtual methods
.method public g()Ly0/b;
    .locals 2

    sget-object v0, Ly0/k0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    sget-object v0, Ly0/b;->o:Ly0/b;

    goto :goto_0

    :cond_0
    sget-object v0, Ly0/b;->s:Ly0/b;

    goto :goto_0

    :cond_1
    sget-object v0, Ly0/b;->r:Ly0/b;

    goto :goto_0

    :cond_2
    sget-object v0, Ly0/b;->q:Ly0/b;

    goto :goto_0

    :cond_3
    sget-object v0, Ly0/b;->p:Ly0/b;

    goto :goto_0

    :cond_4
    sget-object v0, Ly0/b;->n:Ly0/b;

    :goto_0
    return-object v0
.end method
