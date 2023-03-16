.class public final enum Lp6/a$c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Le6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp6/a$c;",
        ">;",
        "Le6/c;"
    }
.end annotation


# static fields
.field public static final enum o:Lp6/a$c;

.field public static final enum p:Lp6/a$c;

.field public static final enum q:Lp6/a$c;

.field public static final enum r:Lp6/a$c;

.field private static final synthetic s:[Lp6/a$c;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lp6/a$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lp6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lp6/a$c;->o:Lp6/a$c;

    new-instance v1, Lp6/a$c;

    const-string v3, "DATA_MESSAGE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lp6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lp6/a$c;->p:Lp6/a$c;

    new-instance v3, Lp6/a$c;

    const-string v5, "TOPIC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lp6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lp6/a$c;->q:Lp6/a$c;

    new-instance v5, Lp6/a$c;

    const-string v7, "DISPLAY_NOTIFICATION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lp6/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lp6/a$c;->r:Lp6/a$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lp6/a$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lp6/a$c;->s:[Lp6/a$c;

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

    iput p3, p0, Lp6/a$c;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp6/a$c;
    .locals 1

    const-class v0, Lp6/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp6/a$c;

    return-object p0
.end method

.method public static values()[Lp6/a$c;
    .locals 1

    sget-object v0, Lp6/a$c;->s:[Lp6/a$c;

    invoke-virtual {v0}, [Lp6/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp6/a$c;

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, Lp6/a$c;->n:I

    return v0
.end method
