.class final enum La5/a$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La5/a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:La5/a$b;

.field public static final enum o:La5/a$b;

.field public static final enum p:La5/a$b;

.field public static final enum q:La5/a$b;

.field private static final synthetic r:[La5/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La5/a$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La5/a$b;->n:La5/a$b;

    new-instance v0, La5/a$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La5/a$b;->o:La5/a$b;

    new-instance v0, La5/a$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, La5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La5/a$b;->p:La5/a$b;

    new-instance v0, La5/a$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La5/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La5/a$b;->q:La5/a$b;

    invoke-static {}, La5/a$b;->e()[La5/a$b;

    move-result-object v0

    sput-object v0, La5/a$b;->r:[La5/a$b;

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

.method private static synthetic e()[La5/a$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [La5/a$b;

    sget-object v1, La5/a$b;->n:La5/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, La5/a$b;->o:La5/a$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, La5/a$b;->p:La5/a$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, La5/a$b;->q:La5/a$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)La5/a$b;
    .locals 1

    const-class v0, La5/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La5/a$b;

    return-object p0
.end method

.method public static values()[La5/a$b;
    .locals 1

    sget-object v0, La5/a$b;->r:[La5/a$b;

    invoke-virtual {v0}, [La5/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La5/a$b;

    return-object v0
.end method
