.class public final enum Ls8/h$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls8/h$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Ls8/h$c;

.field public static final enum p:Ls8/h$c;

.field public static final enum q:Ls8/h$c;

.field public static final enum r:Ls8/h$c;

.field public static final enum s:Ls8/h$c;

.field public static final enum t:Ls8/h$c;

.field public static final enum u:Ls8/h$c;

.field public static final enum v:Ls8/h$c;

.field public static final enum w:Ls8/h$c;

.field public static final enum x:Ls8/h$c;

.field public static final enum y:Ls8/h$c;

.field private static final synthetic z:[Ls8/h$c;


# instance fields
.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ls8/h$c;

    const-string v1, "root"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ls8/h$c;->o:Ls8/h$c;

    new-instance v1, Ls8/h$c;

    const-string v3, "music"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ls8/h$c;->p:Ls8/h$c;

    new-instance v3, Ls8/h$c;

    const-string v5, "podcasts"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ls8/h$c;->q:Ls8/h$c;

    new-instance v5, Ls8/h$c;

    const-string v7, "ringtones"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ls8/h$c;->r:Ls8/h$c;

    new-instance v7, Ls8/h$c;

    const-string v9, "alarms"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Ls8/h$c;->s:Ls8/h$c;

    new-instance v9, Ls8/h$c;

    const-string v11, "notifications"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Ls8/h$c;->t:Ls8/h$c;

    new-instance v11, Ls8/h$c;

    const-string v13, "pictures"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v11, Ls8/h$c;->u:Ls8/h$c;

    new-instance v13, Ls8/h$c;

    const-string v15, "movies"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v13, Ls8/h$c;->v:Ls8/h$c;

    new-instance v15, Ls8/h$c;

    const-string v14, "downloads"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v15, Ls8/h$c;->w:Ls8/h$c;

    new-instance v14, Ls8/h$c;

    const-string v12, "dcim"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v14, Ls8/h$c;->x:Ls8/h$c;

    new-instance v12, Ls8/h$c;

    const-string v10, "documents"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v8}, Ls8/h$c;-><init>(Ljava/lang/String;II)V

    sput-object v12, Ls8/h$c;->y:Ls8/h$c;

    const/16 v10, 0xb

    new-array v10, v10, [Ls8/h$c;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    const/16 v0, 0x8

    aput-object v15, v10, v0

    const/16 v0, 0x9

    aput-object v14, v10, v0

    aput-object v12, v10, v8

    sput-object v10, Ls8/h$c;->z:[Ls8/h$c;

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

    iput p3, p0, Ls8/h$c;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls8/h$c;
    .locals 1

    const-class v0, Ls8/h$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls8/h$c;

    return-object p0
.end method

.method public static values()[Ls8/h$c;
    .locals 1

    sget-object v0, Ls8/h$c;->z:[Ls8/h$c;

    invoke-virtual {v0}, [Ls8/h$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls8/h$c;

    return-object v0
.end method
