.class Lj$/util/concurrent/p;
.super Ljava/lang/Object;


# instance fields
.field a:[Lj$/util/concurrent/l;

.field b:Lj$/util/concurrent/l;

.field c:Lj$/util/concurrent/o;

.field d:Lj$/util/concurrent/o;

.field e:I

.field f:I

.field g:I

.field final h:I


# direct methods
.method constructor <init>([Lj$/util/concurrent/l;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/concurrent/p;->a:[Lj$/util/concurrent/l;

    iput p2, p0, Lj$/util/concurrent/p;->h:I

    iput p3, p0, Lj$/util/concurrent/p;->e:I

    iput p3, p0, Lj$/util/concurrent/p;->f:I

    iput p4, p0, Lj$/util/concurrent/p;->g:I

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/concurrent/p;->b:Lj$/util/concurrent/l;

    return-void
.end method


# virtual methods
.method final b()Lj$/util/concurrent/l;
    .locals 6

    iget-object v0, p0, Lj$/util/concurrent/p;->b:Lj$/util/concurrent/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lj$/util/concurrent/l;->d:Lj$/util/concurrent/l;

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    iput-object v0, p0, Lj$/util/concurrent/p;->b:Lj$/util/concurrent/l;

    return-object v0

    :cond_1
    iget v0, p0, Lj$/util/concurrent/p;->f:I

    iget v2, p0, Lj$/util/concurrent/p;->g:I

    if-ge v0, v2, :cond_9

    iget-object v0, p0, Lj$/util/concurrent/p;->a:[Lj$/util/concurrent/l;

    if-eqz v0, :cond_9

    array-length v2, v0

    iget v3, p0, Lj$/util/concurrent/p;->e:I

    if-le v2, v3, :cond_9

    if-gez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {v0, v3}, Lj$/util/concurrent/ConcurrentHashMap;->n([Lj$/util/concurrent/l;I)Lj$/util/concurrent/l;

    move-result-object v4

    if-eqz v4, :cond_6

    iget v5, v4, Lj$/util/concurrent/l;->a:I

    if-gez v5, :cond_6

    instance-of v5, v4, Lj$/util/concurrent/g;

    if-eqz v5, :cond_4

    check-cast v4, Lj$/util/concurrent/g;

    iget-object v4, v4, Lj$/util/concurrent/g;->e:[Lj$/util/concurrent/l;

    iput-object v4, p0, Lj$/util/concurrent/p;->a:[Lj$/util/concurrent/l;

    .line 1
    iget-object v4, p0, Lj$/util/concurrent/p;->d:Lj$/util/concurrent/o;

    if-eqz v4, :cond_3

    iget-object v5, v4, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    iput-object v5, p0, Lj$/util/concurrent/p;->d:Lj$/util/concurrent/o;

    goto :goto_1

    :cond_3
    new-instance v4, Lj$/util/concurrent/o;

    invoke-direct {v4}, Lj$/util/concurrent/o;-><init>()V

    :goto_1
    iput-object v0, v4, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    iput v2, v4, Lj$/util/concurrent/o;->a:I

    iput v3, v4, Lj$/util/concurrent/o;->b:I

    iget-object v0, p0, Lj$/util/concurrent/p;->c:Lj$/util/concurrent/o;

    iput-object v0, v4, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    iput-object v4, p0, Lj$/util/concurrent/p;->c:Lj$/util/concurrent/o;

    move-object v0, v1

    goto :goto_0

    .line 2
    :cond_4
    instance-of v0, v4, Lj$/util/concurrent/q;

    if-eqz v0, :cond_5

    check-cast v4, Lj$/util/concurrent/q;

    iget-object v0, v4, Lj$/util/concurrent/q;->f:Lj$/util/concurrent/r;

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_2

    :cond_6
    move-object v0, v4

    :goto_2
    iget-object v4, p0, Lj$/util/concurrent/p;->c:Lj$/util/concurrent/o;

    if-eqz v4, :cond_8

    .line 3
    :goto_3
    iget-object v3, p0, Lj$/util/concurrent/p;->c:Lj$/util/concurrent/o;

    if-eqz v3, :cond_7

    iget v4, p0, Lj$/util/concurrent/p;->e:I

    iget v5, v3, Lj$/util/concurrent/o;->a:I

    add-int/2addr v4, v5

    iput v4, p0, Lj$/util/concurrent/p;->e:I

    if-lt v4, v2, :cond_7

    iget v2, v3, Lj$/util/concurrent/o;->b:I

    iput v2, p0, Lj$/util/concurrent/p;->e:I

    iget-object v2, v3, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    iput-object v2, p0, Lj$/util/concurrent/p;->a:[Lj$/util/concurrent/l;

    iput-object v1, v3, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    iget-object v2, v3, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    iget-object v4, p0, Lj$/util/concurrent/p;->d:Lj$/util/concurrent/o;

    iput-object v4, v3, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    iput-object v2, p0, Lj$/util/concurrent/p;->c:Lj$/util/concurrent/o;

    iput-object v3, p0, Lj$/util/concurrent/p;->d:Lj$/util/concurrent/o;

    move v2, v5

    goto :goto_3

    :cond_7
    if-nez v3, :cond_0

    iget v3, p0, Lj$/util/concurrent/p;->e:I

    iget v4, p0, Lj$/util/concurrent/p;->h:I

    add-int/2addr v3, v4

    iput v3, p0, Lj$/util/concurrent/p;->e:I

    if-lt v3, v2, :cond_0

    iget v2, p0, Lj$/util/concurrent/p;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lj$/util/concurrent/p;->f:I

    iput v2, p0, Lj$/util/concurrent/p;->e:I

    goto/16 :goto_0

    .line 4
    :cond_8
    iget v4, p0, Lj$/util/concurrent/p;->h:I

    add-int/2addr v3, v4

    iput v3, p0, Lj$/util/concurrent/p;->e:I

    if-lt v3, v2, :cond_0

    iget v2, p0, Lj$/util/concurrent/p;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lj$/util/concurrent/p;->f:I

    iput v2, p0, Lj$/util/concurrent/p;->e:I

    goto/16 :goto_0

    :cond_9
    :goto_4
    iput-object v1, p0, Lj$/util/concurrent/p;->b:Lj$/util/concurrent/l;

    return-object v1
.end method
