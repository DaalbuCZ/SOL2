.class public final enum Lk8/p$g;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk8/p$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lk8/p$g;

.field public static final enum p:Lk8/p$g;

.field public static final enum q:Lk8/p$g;

.field public static final enum r:Lk8/p$g;

.field public static final enum s:Lk8/p$g;

.field public static final enum t:Lk8/p$g;

.field public static final enum u:Lk8/p$g;

.field public static final enum v:Lk8/p$g;

.field public static final enum w:Lk8/p$g;

.field public static final enum x:Lk8/p$g;

.field public static final enum y:Lk8/p$g;

.field private static final synthetic z:[Lk8/p$g;


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lk8/p$g;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    const-string v3, "TextInputType.text"

    invoke-direct {v0, v1, v2, v3}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk8/p$g;->o:Lk8/p$g;

    new-instance v1, Lk8/p$g;

    const-string v3, "DATETIME"

    const/4 v4, 0x1

    const-string v5, "TextInputType.datetime"

    invoke-direct {v1, v3, v4, v5}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lk8/p$g;->p:Lk8/p$g;

    new-instance v3, Lk8/p$g;

    const-string v5, "NAME"

    const/4 v6, 0x2

    const-string v7, "TextInputType.name"

    invoke-direct {v3, v5, v6, v7}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lk8/p$g;->q:Lk8/p$g;

    new-instance v5, Lk8/p$g;

    const-string v7, "POSTAL_ADDRESS"

    const/4 v8, 0x3

    const-string v9, "TextInputType.address"

    invoke-direct {v5, v7, v8, v9}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lk8/p$g;->r:Lk8/p$g;

    new-instance v7, Lk8/p$g;

    const-string v9, "NUMBER"

    const/4 v10, 0x4

    const-string v11, "TextInputType.number"

    invoke-direct {v7, v9, v10, v11}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lk8/p$g;->s:Lk8/p$g;

    new-instance v9, Lk8/p$g;

    const-string v11, "PHONE"

    const/4 v12, 0x5

    const-string v13, "TextInputType.phone"

    invoke-direct {v9, v11, v12, v13}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lk8/p$g;->t:Lk8/p$g;

    new-instance v11, Lk8/p$g;

    const-string v13, "MULTILINE"

    const/4 v14, 0x6

    const-string v15, "TextInputType.multiline"

    invoke-direct {v11, v13, v14, v15}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lk8/p$g;->u:Lk8/p$g;

    new-instance v13, Lk8/p$g;

    const-string v15, "EMAIL_ADDRESS"

    const/4 v14, 0x7

    const-string v12, "TextInputType.emailAddress"

    invoke-direct {v13, v15, v14, v12}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lk8/p$g;->v:Lk8/p$g;

    new-instance v12, Lk8/p$g;

    const-string v15, "URL"

    const/16 v14, 0x8

    const-string v10, "TextInputType.url"

    invoke-direct {v12, v15, v14, v10}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lk8/p$g;->w:Lk8/p$g;

    new-instance v10, Lk8/p$g;

    const-string v15, "VISIBLE_PASSWORD"

    const/16 v14, 0x9

    const-string v8, "TextInputType.visiblePassword"

    invoke-direct {v10, v15, v14, v8}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lk8/p$g;->x:Lk8/p$g;

    new-instance v8, Lk8/p$g;

    const-string v15, "NONE"

    const/16 v14, 0xa

    const-string v6, "TextInputType.none"

    invoke-direct {v8, v15, v14, v6}, Lk8/p$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lk8/p$g;->y:Lk8/p$g;

    const/16 v6, 0xb

    new-array v6, v6, [Lk8/p$g;

    aput-object v0, v6, v2

    aput-object v1, v6, v4

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    const/4 v0, 0x7

    aput-object v13, v6, v0

    const/16 v0, 0x8

    aput-object v12, v6, v0

    const/16 v0, 0x9

    aput-object v10, v6, v0

    aput-object v8, v6, v14

    sput-object v6, Lk8/p$g;->z:[Lk8/p$g;

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

    iput-object p3, p0, Lk8/p$g;->n:Ljava/lang/String;

    return-void
.end method

.method static e(Ljava/lang/String;)Lk8/p$g;
    .locals 5

    invoke-static {}, Lk8/p$g;->values()[Lk8/p$g;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lk8/p$g;->n:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such TextInputType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk8/p$g;
    .locals 1

    const-class v0, Lk8/p$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk8/p$g;

    return-object p0
.end method

.method public static values()[Lk8/p$g;
    .locals 1

    sget-object v0, Lk8/p$g;->z:[Lk8/p$g;

    invoke-virtual {v0}, [Lk8/p$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk8/p$g;

    return-object v0
.end method
