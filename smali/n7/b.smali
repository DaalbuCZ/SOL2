.class public final enum Ln7/b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln7/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ln7/b;

.field public static final enum o:Ln7/b;

.field public static final enum p:Ln7/b;

.field public static final enum q:Ln7/b;

.field public static final enum r:Ln7/b;

.field public static final enum s:Ln7/b;

.field public static final enum t:Ln7/b;

.field public static final enum u:Ln7/b;

.field public static final enum v:Ln7/b;

.field public static final enum w:Ln7/b;

.field private static final synthetic x:[Ln7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ln7/b;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln7/b;->n:Ln7/b;

    new-instance v1, Ln7/b;

    const-string v3, "END_ARRAY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln7/b;->o:Ln7/b;

    new-instance v3, Ln7/b;

    const-string v5, "BEGIN_OBJECT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ln7/b;->p:Ln7/b;

    new-instance v5, Ln7/b;

    const-string v7, "END_OBJECT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ln7/b;->q:Ln7/b;

    new-instance v7, Ln7/b;

    const-string v9, "NAME"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ln7/b;->r:Ln7/b;

    new-instance v9, Ln7/b;

    const-string v11, "STRING"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ln7/b;->s:Ln7/b;

    new-instance v11, Ln7/b;

    const-string v13, "NUMBER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ln7/b;->t:Ln7/b;

    new-instance v13, Ln7/b;

    const-string v15, "BOOLEAN"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ln7/b;->u:Ln7/b;

    new-instance v15, Ln7/b;

    const-string v14, "NULL"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ln7/b;->v:Ln7/b;

    new-instance v14, Ln7/b;

    const-string v12, "END_DOCUMENT"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ln7/b;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ln7/b;->w:Ln7/b;

    const/16 v12, 0xa

    new-array v12, v12, [Ln7/b;

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

    sput-object v12, Ln7/b;->x:[Ln7/b;

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

.method public static valueOf(Ljava/lang/String;)Ln7/b;
    .locals 1

    const-class v0, Ln7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln7/b;

    return-object p0
.end method

.method public static values()[Ln7/b;
    .locals 1

    sget-object v0, Ln7/b;->x:[Ln7/b;

    invoke-virtual {v0}, [Ln7/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln7/b;

    return-object v0
.end method
